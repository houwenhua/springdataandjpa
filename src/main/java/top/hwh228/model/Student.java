package top.hwh228.model;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 4:09
 */
public class Student {

    /**
     * id
     * */
    private Integer id;
    /**
     * 姓名
     *
     * */
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
