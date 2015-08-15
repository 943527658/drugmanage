package com.ysj.serlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ysj.pojo.User;
import com.ysj.service.UserService;
import com.ysj.service.impl.UserServieImpl;
import com.ysj.util.JsonUtil;


public class UserSerlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getParameter("m");
		UserService us =new UserServieImpl();
		if ("lst".equals(method)){
			List<User> l = us.queryAllUser();
			String jsonStr = JsonUtil.toJson(l);
			PrintWriter out = resp.getWriter();
			out.println(jsonStr);
		}else if("add".equals(method)){
			
			String name = req.getParameter("name");
			String select_key = req.getParameter("select_key");
			String files_num = req.getParameter("files_num");
			
			String licence_num = req.getParameter("licence_num");
			String permit_name = req.getParameter("permit_name");
			String login_address = req.getParameter("login_address");
			String legal_peo = req.getParameter("legal_peo");
			String permit_peo = req.getParameter("permit_peo");
			String quality_peo = req.getParameter("quality_peo");
			String storage_address = req.getParameter("storage_address");
			String valid_until = req.getParameter("valid_until");
			String operate_way = req.getParameter("operate_way");
			String operate_scope = req.getParameter("operate_scope");
			String certificate_organ = req.getParameter("certificate_organ");
			String certificate_date = req.getParameter("certificate_date");
			
			String login_num = req.getParameter("login_num");
			String license_name = req.getParameter("license_name");
			String license_address = req.getParameter("license_address");
			String delegate_name = req.getParameter("delegate_name");
			String login_capital = req.getParameter("login_capital");
			String paid_captial = req.getParameter("paid_captial");
			String company_type = req.getParameter("company_type");
			String license_scope = req.getParameter("license_scope");
			String establish_date = req.getParameter("establish_date");
			String license_start = req.getParameter("license_start");
			String license_end = req.getParameter("license_end");
			String license_organ = req.getParameter("license_organ");
			String license_date = req.getParameter("license_date");
			
			String gsp_num = req.getParameter("gsp_num");
			String gsp_name = req.getParameter("gsp_name");
			String gsp_address = req.getParameter("gsp_address");
			String gsp_scope = req.getParameter("gsp_scope");
			String gsp_end = req.getParameter("gsp_end");
			String gsp_organ = req.getParameter("gsp_organ");
			String gsp_date = req.getParameter("gsp_date");
			
			String open_name = req.getParameter("open_name");
			String open_bank = req.getParameter("open_bank");
			String open_num = req.getParameter("open_num");
			
			String tax_num = req.getParameter("tax_num");
			String tax_name = req.getParameter("tax_name");
			String tax_peo = req.getParameter("tax_peo");
			String tax_address = req.getParameter("tax_address");
			String tax_type = req.getParameter("tax_type");
			String tax_scope = req.getParameter("tax_scope");
			String tax_p_organ = req.getParameter("tax_p_organ");
			String tax_pay = req.getParameter("tax_pay");
			String tax_organ = req.getParameter("tax_organ");
			String tax_date = req.getParameter("tax_date");
			
			String code_id = req.getParameter("code_id");
			String code_name = req.getParameter("code_name");
			String code_scope = req.getParameter("code_scope");
			String code_address = req.getParameter("code_address");
			String code_start = req.getParameter("code_start");
			String code_end = req.getParameter("code_end");
			String code_monad = req.getParameter("code_monad");
			String code_num = req.getParameter("code_num");
			
			
			User user = new User();
			
			user.setName(name);
			user.setSelect_key(select_key);
			user.setFiles_num(files_num);
			
			user.setLicence_num(licence_num);
			user.setPermit_name(permit_name);
			user.setLicense_name(license_name);
			user.setLogin_address(login_address);
			user.setLegal_peo(legal_peo);
			user.setPermit_peo(permit_peo);
			user.setQuality_peo(quality_peo);
			user.setStorage_address(storage_address);
			user.setValid_until(valid_until);
			user.setOperate_way(operate_way);
			user.setOperate_scope(operate_scope);
			user.setCertificate_organ(certificate_organ);
			user.setCertificate_date(certificate_date);
			
			user.setLogin_num(login_num);
			user.setLicense_name(license_name);
			user.setLicense_address(license_address);
			user.setDelegate_name(delegate_name);
			user.setLogin_capital(login_capital);
			user.setPaid_captial(paid_captial);
			user.setCompany_type(company_type);
			user.setLicense_scope(license_scope);
			user.setEstablish_date(establish_date);
			user.setLicense_start(license_start);
			user.setLicense_end(license_end);
			user.setLicense_organ(license_organ);
			user.setLicense_date(license_date);
			
			user.setGsp_num(gsp_num);
			user.setGsp_name(gsp_name);
			user.setGsp_address(gsp_address);
			user.setGsp_scope(gsp_scope);
			user.setGsp_end(gsp_end);
			user.setGsp_organ(gsp_organ);
			user.setGsp_date(gsp_date);
			
			user.setOpen_name(open_name);
			user.setOpen_bank(open_bank);
			user.setOpen_num(open_num);
			
			user.setTax_num(tax_num);
			user.setTax_name(tax_name);
			user.setTax_peo(tax_peo);
			user.setTax_address(tax_address);
			user.setTax_type(tax_type);
			user.setTax_scope(tax_scope);
			user.setTax_p_organ(tax_p_organ);
			user.setTax_pay(tax_pay);
			user.setTax_organ(tax_organ);
			user.setTax_date(tax_date);
			
			user.setCode_id(code_id);
			user.setCode_name(code_name);
			user.setCode_scope(code_scope);
			user.setCode_address(code_address);
			user.setCode_start(code_start);
			user.setCode_end(code_end);
			user.setCode_monad(code_monad);
			user.setCode_num(code_num);
			
			us.addUser(user);
			
		}else if("update".equals(method)){
			String id = req.getParameter("id");
			String name = req.getParameter("name");
			String select_key = req.getParameter("select_key");
			String files_num = req.getParameter("files_num");
			

			String licence_num = req.getParameter("licence_num");
			String permit_name = req.getParameter("permit_name");
			String login_address = req.getParameter("login_address");
			String legal_peo = req.getParameter("legal_peo");
			String permit_peo = req.getParameter("permit_peo");
			String quality_peo = req.getParameter("quality_peo");
			String storage_address = req.getParameter("storage_address");
			String valid_until = req.getParameter("valid_until");
			String operate_way = req.getParameter("operate_way");
			String operate_scope = req.getParameter("operate_scope");
			String certificate_organ = req.getParameter("certificate_organ");
			String certificate_date = req.getParameter("certificate_date");
			
			String login_num = req.getParameter("login_num");
			String license_name = req.getParameter("license_name");
			String license_address = req.getParameter("license_address");
			String delegate_name = req.getParameter("delegate_name");
			String login_capital = req.getParameter("login_capital");
			String paid_captial = req.getParameter("paid_captial");
			String company_type = req.getParameter("company_type");
			String license_scope = req.getParameter("license_scope");
			String establish_date = req.getParameter("establish_date");
			String license_start = req.getParameter("license_start");
			String license_end = req.getParameter("license_end");
			String license_organ = req.getParameter("license_organ");
			String license_date = req.getParameter("license_date");
			
			String gsp_num = req.getParameter("gsp_num");
			String gsp_name = req.getParameter("gsp_name");
			String gsp_address = req.getParameter("gsp_address");
			String gsp_scope = req.getParameter("gsp_scope");
			String gsp_end = req.getParameter("gsp_end");
			String gsp_organ = req.getParameter("gsp_organ");
			String gsp_date = req.getParameter("gsp_date");
			
			String open_name = req.getParameter("open_name");
			String open_bank = req.getParameter("open_bank");
			String open_num = req.getParameter("open_num");
			
			String tax_num = req.getParameter("tax_num");
			String tax_name = req.getParameter("tax_name");
			String tax_peo = req.getParameter("tax_peo");
			String tax_address = req.getParameter("tax_address");
			String tax_type = req.getParameter("tax_type");
			String tax_scope = req.getParameter("tax_scope");
			String tax_p_organ = req.getParameter("tax_p_organ");
			String tax_pay = req.getParameter("tax_pay");
			String tax_organ = req.getParameter("tax_organ");
			String tax_date = req.getParameter("tax_date");
			
			String code_id = req.getParameter("code_id");
			String code_name = req.getParameter("code_name");
			String code_scope = req.getParameter("code_scope");
			String code_address = req.getParameter("code_address");
			String code_start = req.getParameter("code_start");
			String code_end = req.getParameter("code_end");
			String code_monad = req.getParameter("code_monad");
			String code_num = req.getParameter("code_num");
			
			User user = new User();
			
			user.setId(id);
			user.setName(name);
			user.setSelect_key(select_key);
			user.setFiles_num(files_num);
			
			user.setLicence_num(licence_num);
			user.setPermit_name(permit_name);
			user.setLicense_name(license_name);
			user.setLogin_address(login_address);
			user.setLegal_peo(legal_peo);
			user.setPermit_peo(permit_peo);
			user.setQuality_peo(quality_peo);
			user.setStorage_address(storage_address);
			user.setValid_until(valid_until);
			user.setOperate_way(operate_way);
			user.setOperate_scope(operate_scope);
			user.setCertificate_organ(certificate_organ);
			user.setCertificate_date(certificate_date);
			
			user.setLogin_num(login_num);
			user.setLicense_name(license_name);
			user.setLicense_address(license_address);
			user.setDelegate_name(delegate_name);
			user.setLogin_capital(login_capital);
			user.setPaid_captial(paid_captial);
			user.setCompany_type(company_type);
			user.setLicense_scope(license_scope);
			user.setEstablish_date(establish_date);
			user.setLicense_start(license_start);
			user.setLicense_end(license_end);
			user.setLicense_organ(license_organ);
			user.setLicense_date(license_date);
			
			user.setGsp_num(gsp_num);
			user.setGsp_name(gsp_name);
			user.setGsp_address(gsp_address);
			user.setGsp_scope(gsp_scope);
			user.setGsp_end(gsp_end);
			user.setGsp_organ(gsp_organ);
			user.setGsp_date(gsp_date);
			
			user.setOpen_name(open_name);
			user.setOpen_bank(open_bank);
			user.setOpen_num(open_num);
			
			user.setTax_num(tax_num);
			user.setTax_name(tax_name);
			user.setTax_peo(tax_peo);
			user.setTax_address(tax_address);
			user.setTax_type(tax_type);
			user.setTax_scope(tax_scope);
			user.setTax_p_organ(tax_p_organ);
			user.setTax_pay(tax_pay);
			user.setTax_organ(tax_organ);
			user.setTax_date(tax_date);
			
			user.setCode_id(code_id);
			user.setCode_name(code_name);
			user.setCode_scope(code_scope);
			user.setCode_address(code_address);
			user.setCode_start(code_start);
			user.setCode_end(code_end);
			user.setCode_monad(code_monad);
			user.setCode_num(code_num);
			
			us.updateUser(user);
		}else if("delete".equals(method)){
			String id = req.getParameter("id");
			User user = new User();
			user.setId(id);
			us.deleteUser(user);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
