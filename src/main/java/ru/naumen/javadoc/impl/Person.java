package ru.naumen.javadoc.impl;

import ru.naumen.javadoc.interfaces.Base;
import ru.naumen.javadoc.interfaces.IAnother;

/**
 * Класс для чувака.<br/>
 * Бла бла бла.
 * <p>Created 26.09.14</p>
 *
 * @author kblokhin
 */
public class Person extends Base implements IAnother
{
    /** Имя чувака */
    private String name;

    /** Возраст чувака */
    private Integer age;

    /**
     * Возвращает неский заголовок, который можно отобразить.
     *
     * @param withAge признак, нужно ли в заголовок включать возраст.
     * @return если {@code withAge} равен {@code true}, возвращает имя и возраст, иначе просто имя
     * @throws NullPointerException тупо, конечно, но если age равен null - вылетит птичка
     */
    public String getTitle(boolean withAge) throws NullPointerException
    {
        return withAge ?
                name + " " + age.toString() :
                name;
    }

    /**
     * @return {@link #name}
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name {@link #name}
     */
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
