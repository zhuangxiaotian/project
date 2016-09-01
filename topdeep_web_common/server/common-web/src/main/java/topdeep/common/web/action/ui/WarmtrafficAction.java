package topdeep.common.web.action.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import topdeep.common.web.action.base.BaseAction;
import topdeep.common.web.entity.request.SampleRequest;
import topdeep.common.web.entity.response.BaseResponse;

import common.web.annotation.TopdeepMethodAttribute;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value = {
	"/ui"
})
public class WarmtrafficAction extends BaseAction {

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "warmtraffic", method = {
		RequestMethod.GET
	})
	public String execute(SampleRequest req, Model model) throws Exception {
		BaseResponse res = new BaseResponse();
		model.addAttribute("res", res);
		super.execute(req, res);
		res.setSkin("warmtraffic");
		res.setTitle(req.getType());
		String template = "/ui/warmtraffic-" + req.getType() + "-success";
		return res.getTarget(template);
	}

}
