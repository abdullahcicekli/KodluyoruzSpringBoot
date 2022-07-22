package com.abdullahcicekli.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto  implements Serializable {
    private Long id;
    private String beanName;

    //    başlangıçda çalışacak
    public void initialBeanMethod(){
        log.info("Bean başlamadan önce ben varım.");
        System.err.println("Bean başlamadan Çalışacak Method");

    }

    //    bittikten sonra çalışır.
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra ben varım.");
        System.err.println("Bean bitince Çalışacak Method");
    }

}
