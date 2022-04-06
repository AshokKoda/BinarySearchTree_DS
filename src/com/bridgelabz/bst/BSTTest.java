package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class BSTTest {

	@Test
    public void binaryTreeTest() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(100);
        System.out.println(myBinaryTree.root);
        System.out.println("Size is : " + myBinaryTree.getSize());
        Assert.assertEquals(4,myBinaryTree.getSize());
    }
	
	@Test
    public void binaryTreeArrayTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
		for (int number : numberArray) {
            bst.add(number);
        }
		System.out.println(bst.root);
		System.out.println("Size is : " + bst.getSize());
		Assert.assertEquals(13, bst.getSize());
	}
}
