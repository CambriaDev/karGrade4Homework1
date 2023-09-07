package cam.cambria.kg4h1.controller;

import cam.cambria.kg4h1.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Cambria
 * @Date 2023/9/6 上午10:45
 */

@RestController
@RequestMapping("/api/common")
@RequiredArgsConstructor
public class CommonController {

    private final ChengxiangService chengxiangService;
    private final HangyechengzhenService hangyechengzhenService;
    private final HangyeguoyouService hangyeguoyouService;
    private final JingjichengzhenService jingjichengzhenService;
    private final JingjixiangcunService jingjixiangcunService;
    private final LaodongliService laodongliService;
    private final SancichanyeService sancichanyeService;
    private final SiyingqiyeService siyingqiyeService;

    @GetMapping("/{type}")
    public ResponseEntity<List> getCommonData(@PathVariable String type) {
        return switch (type) {
            case "chengxiang" -> ResponseEntity.ok(chengxiangService.list());
            case "hangyechengzhen" -> ResponseEntity.ok(hangyechengzhenService.list());
            case "hangyeguoyou" -> ResponseEntity.ok(hangyeguoyouService.list());
            case "jingjichengzhen" -> ResponseEntity.ok(jingjichengzhenService.list());
            case "jingjixiangcun" -> ResponseEntity.ok(jingjixiangcunService.list());
            case "laodongli" -> ResponseEntity.ok(laodongliService.list());
            case "sancichanye" -> ResponseEntity.ok(sancichanyeService.list());
            case "siyingqiye" -> ResponseEntity.ok(siyingqiyeService.list());
            default -> ResponseEntity.notFound().build();
        };
    }

}
