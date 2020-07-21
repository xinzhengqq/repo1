package cn.itcast.di;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class ComplexBean {
    private String[] arr;
    private List<Person> list;
    private Set<String> set;
    private Map<String,Person> map;
    private Properties properties;
}
