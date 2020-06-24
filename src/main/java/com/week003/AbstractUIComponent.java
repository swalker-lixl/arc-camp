package com.week003;

public abstract class AbstractUIComponent implements UIComponent {

  protected String id;
  protected String name;

  @Override
  public void render() {
    // 备注：题目要求只需打印一个具体UI组件的类型和名字即可，实际项目中render需要在各个UI组件子类中去实现
    System.out.println(">>>  " + this.getClass().getSimpleName() + "(" + this.name + ")");
  }

}
