package edu.nf.ch08.controller;

import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

/**
 * @author wangl
 * @date 2020/10/22
 */
public class CityController {

    @WebRequest("/list")
    public View listCity(PageBean pageBean) {
        CityService service = new CityService();
        service.listCity(pageBean);
        return new JsonView(pageBean);
    }
}
