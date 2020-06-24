package com.week003;

import java.util.ArrayList;
import java.util.List;

public abstract class ContainerUIComponent extends AbstractUIComponent {

  private List<UIComponent> components = new ArrayList<UIComponent>();

  public void add(UIComponent component) {
    this.components.add(component);
  }

  public void remove(UIComponent component) {
    this.components.remove(component);
  }

  @Override
  public void render() {
    super.render();
    for (UIComponent component : this.components) {
      component.render();
    }
  }


}
