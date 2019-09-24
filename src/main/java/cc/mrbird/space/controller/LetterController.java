package cc.mrbird.space.controller;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.common.util.FebsConstant;
import cc.mrbird.common.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LetterController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Log("获取每日一文信息")
    @RequestMapping("letter")
    @RequiresPermissions("letter:list")
    public String index() {
        return "space/letter/letter";
    }


}
