package cn.hereyou.backendcommon;

import cn.hereyou.backendutils.common.vo.BaseResponseVO;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public  void test(){
        BaseResponseVO r= new BaseResponseVO();
        System.out.printf(r.run("www"));
    }
}
