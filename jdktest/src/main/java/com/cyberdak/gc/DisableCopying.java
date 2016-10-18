/**
 * 
 */  
package com.cyberdak.gc;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

/**   
 * TODO
 *
 * @author 亢伟楠
 * @date 2016年10月13日 下午10:24:28 
 * @version V1.0   
 */
public class DisableCopying {
        public static void main(String[] args) {
            while(true){
                List<String>   list = new ArrayList<String>();
                for(int i = 0;i<=50000;i++){
                    list.add(RandomStringUtils.random(10));
                }
            }
        }
}
