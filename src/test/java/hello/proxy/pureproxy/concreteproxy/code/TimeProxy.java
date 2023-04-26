package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeProxy extends ConcreteLogic {

    private ConcreteLogic concreteLogic;

    public TimeProxy(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    @Override
    public String operation() {
        log.info("TimeProxy 실행!");
        log.info("TimeDecorator 실행!");
        long start = System.currentTimeMillis();

        String result = concreteLogic.operation();

        long end = System.currentTimeMillis();
        long resultTime = end - start;
        log.info("resultTime = {}", resultTime);
        return result;
    }
}
