package com.fabrica_interfaces_graficas.factory;

import com.fabrica_interfaces_graficas.components.NavBar;
import com.fabrica_interfaces_graficas.components.Button;

public interface GUIAbstractFactory {
    Button CreateStyledButton();
    NavBar CreateNavBar();
}
