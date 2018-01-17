package com.dly.util;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.ClientConfig;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;
import java.io.PrintStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JpushUtil
{

  @Value("${jpush.config.appkey}")
  private String appkey;

  @Value("${jpush.config.masterSecret}")
  private String masterSecret;

  public boolean push(String text)
    throws APIConnectionException, cn.jiguang.common.resp.APIRequestException, cn.jpush.api.common.resp.APIRequestException
  {
    JPushClient jpushClient = new JPushClient(this.masterSecret, this.appkey, null, ClientConfig.getInstance());

    PushPayload payload = PushPayload.alertAll(text);

    PushResult result = jpushClient.sendPush(payload);
    System.out.println("返回" + result);

    return true;
  }

  public String getAppkey()
  {
    return this.appkey;
  }
  public void setAppkey(String appkey) {
    this.appkey = appkey;
  }
  public String getMasterSecret() {
    return this.masterSecret;
  }
  public void setMasterSecret(String masterSecret) {
    this.masterSecret = masterSecret;
  }
}