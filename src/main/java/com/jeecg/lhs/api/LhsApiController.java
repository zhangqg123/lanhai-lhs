package com.jeecg.lhs.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeecg.lhs.entity.LhSAccountEntity;
import com.jeecg.lhs.service.LhSAccountService;
import com.jeecg.lhs.utils.WxApi;


/**
 * 这是小程序-小诗词的rest请求
 */
@Controller
@RequestMapping("/api/lhs")
public class LhsApiController {
	
	@Autowired
	private LhSAccountService lhSAccountService;

	
	@RequestMapping("/getOpenid")
	@ResponseBody
	public String getOpenid(String jscode,String xcxId){
		//微信小程序id
		String appId = xcxId;	
		LhSAccountEntity lhSAccount=lhSAccountService.getByAppId(appId);
		//微信小程序Secret
		String appSecret = lhSAccount.getAppSecret();
		
		//获取请求的url
		String url  = WxApi.getJsCodeSessionUrl(appId, appSecret, jscode);
		JSONObject jsonObject = WxApi.httpsRequest(url, "GET", null);
		
		//获取openid
		String openid = "";
		if (null != jsonObject && !jsonObject.containsKey("errcode")) {
			try {
				openid = jsonObject.getString("openid");
			} catch (JSONException e) {
			}
		}
		return openid;
	}
	
}
