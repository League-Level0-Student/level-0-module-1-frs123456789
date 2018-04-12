import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		String answer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		if (answer.equals("a stamp")) {

			JOptionPane.showMessageDialog(null, "Correct!");

			score = score + 1;
		} else {

			JOptionPane.showMessageDialog(null, "YOU ARE AWFUL AT SUCH EASY RIDDLES!!! The answer is a STAMP!!!");

		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		answer = JOptionPane.showInputDialog(
				"There are 40 people on a 2 story cruise ship. There are 30 people on the lower deck and 10 people on the upper deck. The 10 people on the upper deck look down at the 30 people on the lower deck. The people on the upper deck see 34 heads. How is this possible???");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		if (answer.equals("30 foreheads")) {

			JOptionPane.showMessageDialog(null, "Correct!");

			score = score + 1;
		} else {

			JOptionPane.showMessageDialog(null, "YOU ARE AWFUL AT SUCH EASY RIDDLES!!! The answer is 30 FOREHEADS!!!");

		}

		// 2. Make a pop up to show the score.

		
	JOptionPane.showMessageDialog(null, "Your score is " + score +"!!!");
		
		
		
		
	}
}
