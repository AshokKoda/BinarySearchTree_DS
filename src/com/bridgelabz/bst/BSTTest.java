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
}
