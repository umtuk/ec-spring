package org.ec.springcore;

import org.ec.springcore.sequence.SequenceGenerator;
import org.ec.springcore.sequence.config.SequenceGeneratorConfig;
import org.ec.springcore.sequence.dao.SequenceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringcoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfig.class);


        SequenceGenerator generator = context.getBean(SequenceGenerator.class);

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());


        SequenceDao sequenceDao = context.getBean(SequenceDao.class);

        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
    }

}
