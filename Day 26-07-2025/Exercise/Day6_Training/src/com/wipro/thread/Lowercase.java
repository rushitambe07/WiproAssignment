package com.wipro.thread;

import java.util.List;

public class Lowercase implements  Runnable {
    List<String> names;
    
    Lowercase(List<String> names) {
        this.names = names;
    }


@Override
public void run() {
	// TODO Auto-generated method stub
	for (int i = 0; i < names.size(); i++) {
        String name = names.get(i);
        char ch = Character.toLowerCase(name.charAt(0));
        if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            names.set(i, name.toLowerCase());
        }
    }
	
}
}