package com.wisely.highlight_spring4.ch1.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wb-ljy189959 on 2017/6/28.
 */
@Service
@Scope("prototype") //声明Scope为Prototype
public class DemoPrototypeService {

}
