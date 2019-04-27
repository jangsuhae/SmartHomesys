package com.qianfeng.smarthome.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/4/23 10:25
 */
@Component
public class DateConvert implements Converter<String,Date> {
    private static List<String> formarts=new ArrayList<>();
    static {
        formarts.add("yyyy-MM");
        formarts.add("yyyy-MM-dd");
        formarts.add("yyyy-MM-dd HH");
        formarts.add("yyyy-MM-dd HH:mm");
        formarts.add("yyyy-MM-dd HH:mm:ss");
    }
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf=new SimpleDateFormat();
        try {
            if(s.matches("^\\d{4}-\\d{2}$")){
                return new SimpleDateFormat(formarts.get(0)).parse(s);
            }else if(s.matches("^\\d{4}-\\d{2}-\\d{2}$")){
                return new SimpleDateFormat(formarts.get(1)).parse(s);
            }else if(s.matches("^\\d{4}-\\d{2}-\\d{2} {1}\\d{2}$")){
                return new SimpleDateFormat(formarts.get(2)).parse(s);
            }else if(s.matches("^\\d{4}-\\d{2}-\\d{2} {1}\\d{2}:\\d{2}$")){
                return new SimpleDateFormat(formarts.get(3)).parse(s);
            }else if(s.matches("^\\d{4}-\\d{2}-\\d{2} {1}\\d{2}:\\d{2}:\\d{2}$")){
                return new SimpleDateFormat(formarts.get(4)).parse(s);
            }
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return null;

    }
}
