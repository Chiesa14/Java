/**
 * The Student class with comapreTo , hashCode  and equals
 */
public class Student implements  Comparable {
    /**
     * Code The codes of the Student class
     */
    private Integer id;
    private String name;
    private String email;
    /**
     * @param  id id of the student
     * @param name names of the student
     * @param  email email of the student
     */
    public Student(Integer id, String name, String email) {
        super();

        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     *
     * @return  id of thw student
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id sets the id of the student
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name sets the name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email sets the email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param o checks the equality in the class student
     * @return equals method for the class student
     */
    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.id.equals(student.id) && this.name.equals(student.name) && this.email.equals(student.email);
    }

    /**
     *
     * @return hashCode of the student
     */
    @Override
    public  int hashCode() {
        return this.id.hashCode()+this.name.hashCode()+this.email.hashCode();
    }

    /**
     *
     * @param o compares students form the class student
     * @return compareTo method for class student
     */
    @Override
    public int compareTo(Object o) {
        Student st= (Student) o;
        if(this.id.compareTo(st.id) != 0 ) return this.id.compareTo(st.id);
        if(this.name.compareTo(st.name) != 0 ) return this.name.compareTo(st.name);

        return this.email.compareTo(st.email);
    }
}
