package com.week003;

import com.week003.Component.Button;
import com.week003.Component.CheckBox;
import com.week003.Component.Frame;
import com.week003.Component.Label;
import com.week003.Component.LinkLabel;
import com.week003.Component.PasswordBox;
import com.week003.Component.Picture;
import com.week003.Component.TextBox;
import com.week003.Component.WinForm;

public class UILauncher {

  public static void main(String[] args) {
    ContainerUIComponent winForm =new WinForm("winForm", "WINDOW");
    winForm.add(new Picture("PIC_LOGO","login picture"));
    winForm.add(new Button("BTN_LOGIN","login"));
    winForm.add(new Button("BTN_REGISTER","register"));

    ContainerUIComponent frame = new Frame("frame0","FRAME0");
    frame.add(new Label("LABEL_USER_NAME","user name"));
    frame.add(new TextBox("TEXTBOX_USER_NAME","user name text"));
    frame.add(new Label("LABEL_PASSWORD","password"));
    frame.add(new PasswordBox("PASSWORD_BOX","password box"));
    frame.add(new CheckBox("CHECKBOX_REMEMBER","checkbox remember"));
    frame.add(new Label("LABEL_REMEMBER","remember password"));
    frame.add(new LinkLabel("LINK_LABEL_FORGET","forget password"));

    winForm.add(frame);
    winForm.render();
  }

}
