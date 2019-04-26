package com.jeecg.lhs.web.rest;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.VelocityContext;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.jeecgframework.p3.core.common.utils.AjaxJson;
import org.jeecgframework.p3.core.page.SystemTools;
import org.jeecgframework.p3.core.util.plugin.ViewVelocity;
import org.jeecgframework.p3.core.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeecg.lhs.entity.LhSBlacklistEntity;
import com.jeecg.lhs.entity.LhSUserEntity;
import com.jeecg.lhs.service.LhSBlacklistService;
import com.jeecg.lhs.service.LhSUserService;
import com.jeecg.lhs.utils.ResponseMessage;
import com.jeecg.lhs.utils.Result;

 /**
 * 描述：黑名单表
 * @author: www.jeecg.org
 * @since：2019年04月23日 09时42分42秒 星期二 
 * @version:1.0
 */
@Controller
@RequestMapping("/jeecg/lhSRestUser")
@Api(value = "lh用户服务", description = "lh用户服务接口", tags = "lhSRestUserAPI")
public class LhSRestUserController extends BaseController{
	@Autowired
	private LhSUserService lhSUserService;
  
	@ApiOperation(value = "根据ID获取lh用户信息", notes = "根据ID获取lh用户信息", httpMethod = "GET", produces = "application/json")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@RequestMapping("/userInfo")
	public @ResponseBody AjaxJson userInfo(@PathVariable("id") String id,HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if(id!=null&&id!=""){
			try {
	    		System.out.println("id:"+id);
	    		LhSUserEntity lhSUser=new LhSUserEntity();
	    		lhSUser.setId(id);
				MiniDaoPage<LhSUserEntity> list = lhSUserService.getAll(lhSUser, 1, 10);
				List<LhSUserEntity> lhSUserList = list.getResults();
				if(lhSUserList.size()>0){
		    		System.out.println("lhSUserList.size():-----"+lhSUserList.size());
					lhSUser=lhSUserList.get(0);
					lhSUser.setPassword(null);
	//				Map<String,Object> attributes=new HashMap<String,Object>();
	//				attributes.put("status", lhSUser.getStatus());
	//				j.setAttributes(attributes);
					j.setObj(lhSUser);
					j.setSuccess(true);
				}else{
					j.setSuccess(false);
				}
			} catch (Exception e) {
				e.printStackTrace();
				j.setSuccess(false);
			}
		}else{
			j.setSuccess(false);
		}
		return j;
	}
	

}

