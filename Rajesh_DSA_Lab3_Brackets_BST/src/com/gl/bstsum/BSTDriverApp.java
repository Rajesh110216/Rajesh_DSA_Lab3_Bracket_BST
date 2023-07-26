package com.gl.bstsum;

//Lab Assignment
//Find a pair with a given sum in Binary Search Tree

import java.util.ArrayList;

import java.util.Scanner;

public class BSTDriverApp {

	ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		BSTDriverApp bst=new BSTDriverApp();
		Node root=null;
		Node nn=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of nodes :");
		int size=sc.nextInt();
		int i;
		for(i=1;i<=size;i++)
		{
			System.out.println("Please enter data for the node :");
			int item=sc.nextInt();
			nn=new Node(item);
			if(root==null)
				root=nn;
			else						
				bst.insert(root,nn);		
		}
		
		//InOrder Traversal
		
		bst.inOrder(root);
		System.out.println(bst.list);
		
		System.out.println("Please enter the sum :");
		int sum=sc.nextInt(); 
		int flag=0;
		for(i=0;i<bst.list.size();i++)
		{
			int n1=bst.list.get(i); 
			int n2=sum-n1;
			if(bst.list.contains(n2) && n1!=n2 && n1<n2)
			{
				flag=1;
				System.out.println("Pair is ("+n1+ "," +n2+")");
				
			}
		}
		if(flag==0)
			System.out.println("Nodes are not found.");
		
		sc.close();
	}					
						
	
	private void inOrder(Node root) //L-D-R
	{
		if(root!=null)
		{
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}
		
	}

	private void insert(Node root, Node nn) {
		
		if(nn.data>root.data) //traverse in right direction
		{
			if(root.right==null)
			{
				root.right=nn;
			}
			else
			{
				insert(root.right,nn);
			}
		}
		else				 //traverse in left direction
		{
			if(root.left==null)
			{
				root.left=nn;
			}
			else
			{
				insert(root.left,nn);
			}
		}
	
		
	}

}
