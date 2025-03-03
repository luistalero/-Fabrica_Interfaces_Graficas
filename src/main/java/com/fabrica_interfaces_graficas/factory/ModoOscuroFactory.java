package com.fabrica_interfaces_graficas.factory;

import com.fabrica_interfaces_graficas.components.Button;
import com.fabrica_interfaces_graficas.components.ModoOscuroButton;
import com.fabrica_interfaces_graficas.components.ModoOscuroNavBar;
import com.fabrica_interfaces_graficas.components.NavBar;

public class ModoOscuroFactory implements GUIAbstractFactory{
    @Override
    public Button CreateStyledButton() {
        return new ModoOscuroButton();
    }

    @Override
    public NavBar CreateNavBar() {
        return new ModoOscuroNavBar();
    }
}
