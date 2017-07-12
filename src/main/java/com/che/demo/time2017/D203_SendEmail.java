package com.che.demo.time2017;

import java.sql.SQLException;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class D203_SendEmail {

	private static String HostName="smtp.exmail.qq.com";
	private static String senderUser="baoxiangyu@riz-tech.com";
	private static String senderName="阿克苏官方邮件";
	
	public static void main(String[] args) throws SQLException, InterruptedException, EmailException {
		sendEmail();
	}

	private static void sendEmail() throws EmailException {
		HtmlEmail sMail = new HtmlEmail();
//		//smtp host 
		sMail.setHostName(HostName);
		sMail.setAuthentication("baoxiangyu@riz-tech.com", "qq19940207");
		sMail.setFrom(senderUser,senderName);
		
		sMail.addTo("cfbdyx@126.com","");
		sMail.setSubject("EOS系统重置密码");
		sMail.setContent("尊敬的EOS系统用户   测试员工，<br>如果您的账号需要重置密码请点击下方链接<br><br><a href='http://localhost:8088/ResetPasswords/MailboxResetShow?uuid=1f1b82c7-2adf-4493-a064-e14f60e8690b&userid=602466'>点击这里重置密码</a><br>该链接五分钟内有效","text/html;charset=UTF-8");
		sMail.send();
	}

}
