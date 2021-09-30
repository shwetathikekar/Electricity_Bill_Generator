import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testing2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test01");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test02");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test03");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test04");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test05");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test06");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test07");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test08");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test09");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test10");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test11");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test12");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test13");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test14");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test15");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test16");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test17");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test18");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test19");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test20");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test21");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test22");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test23");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test24");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test25");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test26");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        java.lang.Class<?> wildcardClass1 = frameArray0.getClass();
        org.junit.Assert.assertNotNull(frameArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test27");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test28");
        int int0 = javax.swing.JFrame.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test29");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test30");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test31");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test32");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        java.lang.Class<?> wildcardClass1 = windowArray0.getClass();
        org.junit.Assert.assertNotNull(windowArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test33");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test34");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test35");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test36");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test37");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test38");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test39");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test40");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test41");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        java.lang.Class<?> wildcardClass1 = windowArray0.getClass();
        org.junit.Assert.assertNotNull(windowArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test42");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test43");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testing2.test44");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }
}

