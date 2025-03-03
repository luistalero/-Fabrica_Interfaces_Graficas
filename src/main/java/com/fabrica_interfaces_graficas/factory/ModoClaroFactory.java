package com.fabrica_interfaces_graficas.factory;

import com.fabrica_interfaces_graficas.components.Button;
import com.fabrica_interfaces_graficas.components.ModoClaroButton;
import com.fabrica_interfaces_graficas.components.ModoClaroNavBar;
import com.fabrica_interfaces_graficas.components.NavBar;

public class ModoClaroFactory implements GUIAbstractFactory {
    @Override
    public Button CreateStyledButton() {
        return new ModoClaroButton();
    }

    @Override
    public NavBar CreateNavBar() {
        return new ModoClaroNavBar();
    }

}
