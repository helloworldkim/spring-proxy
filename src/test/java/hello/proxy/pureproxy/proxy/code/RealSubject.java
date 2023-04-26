package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject{
    @Override
    public String operation() {
        log.info("실제객체 호출");
        sleep(1000); //1초 걸린다고 가정
        return "data";
    }
    private void sleep(int millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
