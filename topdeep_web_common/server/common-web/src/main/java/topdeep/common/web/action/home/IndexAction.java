package topdeep.common.web.action.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import topdeep.common.web.action.base.BaseAction;
import topdeep.common.web.entity.request.BaseExternalRequest;
import topdeep.common.web.entity.response.BaseResponse;

import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = {
		"/h", "/home"
})
public class IndexAction extends BaseAction {

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "index", method = {
		RequestMethod.GET
	})
	public String execute(BaseExternalRequest req, Model model, HttpServletRequest request) throws Exception {
		BaseResponse res = new BaseResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		return res.getTarget("/home/index-success");
	}

}
