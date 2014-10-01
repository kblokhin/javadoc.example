package ru.naumen.javadoc.impl;

/**
 * <p>Created 26.09.14</p>
 */
public class BadPerson
{
    private String name; // имя

    private Integer age; // возраст

    public String getTitle(boolean withAge) throws NullPointerException
    {
        /**
         * Если withAge, то возвращаем вместе с возрастом
         */
        return withAge ?
                name + " " + age.toString() :
                name;
    }

    /*
     * Возвращает имя
     */
    public String getName()
    {
        return name;
    }

    // Устанавливает имя
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return {@link #age}
     */
    public Integer getAge()
    {
        return age;
    }

    /**
     * @param age {@link #age}
     */
    public void setAge(Integer age)
    {
        this.age = age;
    }
}
