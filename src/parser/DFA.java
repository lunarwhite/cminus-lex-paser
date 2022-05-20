package parser;

import java.util.ArrayList;

public class DFA {
	public ArrayList<DFAState> states = new ArrayList<>();
	
	public DFA() {}

	public DFAState get(int i) {
		return states.get(i);
	}

	public int size() {
		return states.size();
	}

	public int contains(DFAState state) {
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).equals(state)) {
				return i;
			}
		}
		return -1;
	}

	public void printAllStates() {
		int size = states.size();
		for (int i = 0; i < size; i++) {
			System.out.println("I" + i + ":");
			states.get(i).print();
		}
	}
}
