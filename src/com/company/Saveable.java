package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Saveable {
    List<String> write();
    void read(ArrayList<String> Value);

}
