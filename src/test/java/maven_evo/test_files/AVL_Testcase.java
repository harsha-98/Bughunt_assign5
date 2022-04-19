package test_files;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import maven_evo.AVLTree;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AVL_Testcase {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AVL_Testcase.test1");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }
}