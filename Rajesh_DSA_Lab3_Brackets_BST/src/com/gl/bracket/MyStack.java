package com.gl.bracket;

import java.util.Stack;


public class MyStack {

	Stack<Character> stack=new Stack<>();
	public Boolean checkBracket(String input) {
		char z,b;
		for (int i = 0; i < input.length(); i++) {
			z=input.charAt(i);
			
			if(z=='{'|| z=='[' ||z=='(')
			{
				stack.push(z);
				continue;
			}
		
		
			if(stack.isEmpty())
			return false;
		
		switch(z)
		{
		case '}':	b=stack.pop();
					if(b=='['|| b=='(')
					return false;
					break;
					
		case ']':	b=stack.pop();
					if(b=='{'|| b=='(')
					return false;
					break;
		
		case ')':	b=stack.pop();
					if(b=='{'|| b=='[')
					return false;
					break;
		
		}
		
		}
		
		return(stack.isEmpty());
	}

}



