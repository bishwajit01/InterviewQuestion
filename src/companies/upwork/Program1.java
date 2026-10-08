package interview.upwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Q1. Generate Automaton A");
		DFA dfa = generateDFA();

		System.out.println("Q2. Compute Depth of A");
		dfa.Depth();

		System.out.println("\nQ3. Hopcroft's Minimization - Automaton M\n");
		dfa.minimize();

		System.out.println("\nQ4. Depth of Automaton M");
		dfa.Depth();

		System.out.println("\nQ5. Strongly Connected Components using Tarjan's Algorithm");
		dfa.SCC();
	}

	private static DFA generateDFA() {
		String characters[] = { "a", "b" };
		int n = generateRandomNumber(16, 20); // number of states
		Map<Integer, Map<String, Integer>> delta = new HashMap<>(); // transitions
		for (int i = 0; i < n; i++) {
			int fromState = generateRandomNumber(0, n - 1);
			int toState = generateRandomNumber(0, n - 1); // generate random transitions
			
			
			Map<String, Integer> insidemap = new HashMap<>();
			insidemap.put("a",fromState);
			insidemap.put("b",toState);
			
			delta.put(i, insidemap);
		}

		for (int j = 0; j < n; j++) {
			System.out.println("Transitions for state " + j + "." + delta.get(j)); // print transitions
		}

//	    F = sample(delta.keys(), k=(round(.3 * n))) # final / accepting states
//	    F.sort()
//		System.out.println("Accepting states: ",F)
//	    startState = randint(0, n - 1)          # random start state
//	    print("Start state: ", startState)
//	    
//	    states = [i for i in range(0, n)]
//	    regular = list(set(states).symmetric_difference(F))  # filter out accepting states
//	    return DFA(n, startState, F, regular, characters, delta)
		return null;
	}

	public static int generateRandomNumber(int min, int max) {
		Random rand = new Random();
		return min + rand.nextInt((max - min) + 1);
	}
}

class DFA {

	public int disc = 0;
	public int SCC[] = new int[50];
	public String F;
	public String startState;
	public String regular;
	public String sigma;
	public String delta;
	public int n;
	
	
	public DFA(int n, String startState, String F, String regular, String sigma, String delta) {
		this.n = n;
		this.startState = startState;
		this.F = F;
		this.regular = regular;
		this.sigma = sigma;
		this.delta = delta;
	}
	
	public void BFS(int startState) {
		List<Integer> tempQueue = new ArrayList<>();
		List<Integer> visited = new ArrayList<>();
		
		tempQueue.add(startState);
        visited.add(startState);
        
        
	}

	public void Depth() {
	}

	public void SCC() {
	}

	public void minimize() {
	}

}
