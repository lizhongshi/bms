package com.dly.explain.realm;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.dly.explain.dao.TAdminMapper;
import com.dly.explain.entity.TAdmin;
import com.dly.explain.entity.TAdminExample;
import com.dly.explain.entity.TAdminExample.Criteria;





/**
 * 自定义Realm
 * @author Administrator
 *
 */
public class MyRealm extends AuthorizingRealm{
	@Resource
	private TAdminMapper tAdminMapper;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		TAdminExample example =new TAdminExample();
		Criteria criteria=example.createCriteria();
		String  userName=(String)token.getPrincipal();
		criteria.andUserNameEqualTo(userName);
		List<TAdmin>result= tAdminMapper.selectByExample(example);
		if(result.size()>0) {
			
			TAdmin admin=result.get(0);
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(admin.getUserName(),admin.getPassword(),"xxx");
			return authcInfo;
		}else {
			return null;
		}
		
	}

}
