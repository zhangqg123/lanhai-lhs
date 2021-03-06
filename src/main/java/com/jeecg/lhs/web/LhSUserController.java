package com.jeecg.lhs.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.VelocityContext;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.jeecgframework.p3.core.common.utils.AjaxJson;
import org.jeecgframework.p3.core.page.SystemTools;
import org.jeecgframework.p3.core.util.oConvertUtils;
import org.jeecgframework.p3.core.util.plugin.ViewVelocity;
import org.jeecgframework.p3.core.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeecg.lhs.entity.LhSAccountEntity;
import com.jeecg.lhs.entity.LhSDeptEntity;
import com.jeecg.lhs.entity.LhSRoleEntity;
import com.jeecg.lhs.entity.LhSUserEntity;
import com.jeecg.lhs.service.LhSAccountService;
import com.jeecg.lhs.service.LhSDeptService;
import com.jeecg.lhs.service.LhSRoleService;
import com.jeecg.lhs.service.LhSUserService;

/**
 * 描述：用户表
 * @author: www.jeecg.org
 * @since：2019年02月14日 07时41分17秒 星期四 
 * @version:1.0
 */
@Controller
@RequestMapping("/jeecg/lhSUser")
public class LhSUserController extends BaseController{
  @Autowired
  private LhSUserService lhSUserService;
  @Autowired
  private LhSDeptService lhSDeptService;
  @Autowired
  private LhSRoleService lhSRoleService;
  @Autowired
  private LhSAccountService lhSAccountService;
  
	/**
	  * 列表页面
	  * @return
	  */
	@RequestMapping(params = "list",method = {RequestMethod.GET,RequestMethod.POST})
	public void list(@ModelAttribute LhSUserEntity query,HttpServletRequest request,HttpServletResponse response,
			@RequestParam(required = false, value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(required = false, value = "pageSize", defaultValue = "10") int pageSize) throws Exception{
			try {
			 	LOG.info(request, " back list");
			 	//分页数据
				String xcxId=(String) request.getSession().getAttribute("departAddress");
				MiniDaoPage<LhSAccountEntity> alist = null;
				if(!oConvertUtils.isEmpty(xcxId)){
					query.setXcxid(xcxId);;
				}else{
					alist =  lhSAccountService.getAll(new LhSAccountEntity(),1,100);					
				}

				MiniDaoPage<LhSUserEntity> list =  lhSUserService.getAll(query,pageNo,pageSize);
				VelocityContext velocityContext = new VelocityContext();
				velocityContext.put("lhSUser",query);
				if(query.getXcxid()!=null){
					LhSRoleEntity lhSRoleEntity=new LhSRoleEntity();
					lhSRoleEntity.setXcxId(query.getXcxid());
					MiniDaoPage<LhSRoleEntity> rlist =  lhSRoleService.getAll(lhSRoleEntity,1,100);
					velocityContext.put("roleList",rlist.getResults());
				}
				if(alist!=null){
					velocityContext.put("accountList",alist.getResults());
				}
				
				velocityContext.put("pageInfos",SystemTools.convertPaginatedList(list));
				String viewName = "jeecg/lhs/lhSUser-list.vm";
				ViewVelocity.view(request,response,viewName,velocityContext);
			} catch (Exception e) {
				e.printStackTrace();
			}
}

	 /**
	  * 详情
	  * @return
	  */
	@RequestMapping(params="toDetail",method = RequestMethod.GET)
	public void lhSUserDetail(@RequestParam(required = true, value = "id" ) String id,HttpServletResponse response,HttpServletRequest request)throws Exception{
			VelocityContext velocityContext = new VelocityContext();
			String viewName = "jeecg/lhs/lhSUser-detail.vm";
			LhSUserEntity lhSUser = lhSUserService.get(id);
			velocityContext.put("lhSUser",lhSUser);
			ViewVelocity.view(request,response,viewName,velocityContext);
	}

	/**
	 * 跳转到添加页面
	 * @return
	 */
	@RequestMapping(params = "toAdd",method ={RequestMethod.GET, RequestMethod.POST})
	public void toAddDialog(HttpServletRequest request,HttpServletResponse response)throws Exception{
		String xcxId=(String) request.getSession().getAttribute("departAddress");
		if(oConvertUtils.isEmpty(xcxId)){
			xcxId=request.getParameter("xcxid");
		}

		LhSUserEntity lhSUser = new LhSUserEntity();
		if(!oConvertUtils.isEmpty(xcxId)){
			lhSUser.setXcxid(xcxId);
		}
		LhSRoleEntity lhSRoleEntity=new LhSRoleEntity();
		lhSRoleEntity.setXcxId(lhSUser.getXcxid());
		MiniDaoPage<LhSRoleEntity> rlist =  lhSRoleService.getAll(lhSRoleEntity,1,100);
		VelocityContext velocityContext = new VelocityContext();
		String viewName = "jeecg/lhs/lhSUser-add.vm";
		velocityContext.put("lhSUser",lhSUser);
		velocityContext.put("roleList",rlist.getResults());
		ViewVelocity.view(request,response,viewName,velocityContext);
	}

	/**
	 * 保存信息
	 * @return
	 */
	@RequestMapping(params = "doAdd",method ={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public AjaxJson doAdd(@ModelAttribute LhSUserEntity lhSUser){
		AjaxJson j = new AjaxJson();
		try {
			lhSUserService.insert(lhSUser);
			j.setMsg("保存成功");
		} catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("保存失败");
		    e.printStackTrace();
		}
		return j;
	}

	/**
	 * 跳转到编辑页面
	 * @return
	 */
	@RequestMapping(params="toEdit",method = RequestMethod.GET)
	public void toEdit(@RequestParam(required = true, value = "id" ) String id,HttpServletResponse response,HttpServletRequest request) throws Exception{
		MiniDaoPage<LhSDeptEntity> list =  lhSDeptService.getAll(new LhSDeptEntity(),1,200);
		VelocityContext velocityContext = new VelocityContext();
		LhSUserEntity lhSUser = lhSUserService.get(id);
		LhSRoleEntity lhSRoleEntity=new LhSRoleEntity();
		lhSRoleEntity.setXcxId(lhSUser.getXcxid());
		MiniDaoPage<LhSRoleEntity> rlist =  lhSRoleService.getAll(lhSRoleEntity,1,100);
		velocityContext.put("lhSUser",lhSUser);
		velocityContext.put("deptList",list.getResults());
		velocityContext.put("roleList",rlist.getResults());
		String viewName = "jeecg/lhs/lhSUser-edit.vm";
		ViewVelocity.view(request,response,viewName,velocityContext);
	}

	/**
	 * 编辑
	 * @return
	 */
	@RequestMapping(params = "doEdit",method ={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public AjaxJson doEdit(@ModelAttribute LhSUserEntity lhSUser){
		AjaxJson j = new AjaxJson();
		try {
			lhSUserService.update(lhSUser);
			j.setMsg("编辑成功");
		} catch (Exception e) {
			j.setSuccess(false);
			j.setMsg("编辑失败");
		    e.printStackTrace();
		}
		return j;
	}


	/**
	 * 删除
	 * @return
	 */
	@RequestMapping(params="doDelete",method = RequestMethod.GET)
	@ResponseBody
	public AjaxJson doDelete(@RequestParam(required = true, value = "id" ) String id){
			AjaxJson j = new AjaxJson();
			try {
				lhSUserService.delete(id);
				j.setMsg("删除成功");
			} catch (Exception e) {
				j.setSuccess(false);
				j.setMsg("删除失败");
			    e.printStackTrace();
			}
			return j;
	}
	
	/**
	 * 批量删除数据
	 * @param ids
	 * @return
	 */
	@RequestMapping(params="batchDelete",method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson batchDelete(@RequestParam(required = true, value = "ids") String[] ids) {
		AjaxJson j = new AjaxJson();
		try {
			lhSUserService.batchDelete(ids);
			j.setMsg("批量删除成功");
		} catch(Exception e) {
			j.setSuccess(false);
			j.setMsg("批量删除失败");
			e.printStackTrace();
		}
		return j;
	}
	

}

