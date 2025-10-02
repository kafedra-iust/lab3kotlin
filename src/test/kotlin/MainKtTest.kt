import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import kotlin.test.Test


class MainLab3KtTest {

    @Test
    @Tag("var1")
    fun var1z2test() {
        assertTrue(var1z2(-1.0, -1.0))
        assertFalse(var1z2(-2.0, -3.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var1")
    fun var1z3test() {
        assertEquals(1.0, var1z3(-1.0))
        assertEquals(-1.0, var1z3(1.0))
        assertEquals(-4.0, var1z3(2.0)) // checked 02.10
    }

    @Test
    @Tag("var2")
    fun var2z2test() {
        assertFalse(var2z2(1.0, 1.0))
        assertTrue(var2z2(-1.0, 1.0))
        assertFalse(var2z2(-1.0,-1.0))
        assertTrue(var2z2(2.0,-2.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var2")
    fun var2z3test() {
        assertEquals(1.0, var2z3(-1.0))
        assertEquals(0.5, var2z3(0.5))
        assertEquals(1.0, var2z3(1.5))
        assertEquals(0.2, var2z3(2.4))  // checked 02.10
    }

    @Test
    @Tag("var3")
    fun var3z2test() {
        assertFalse(var3z2(-2.0, 1.0))
        assertTrue(var3z2(1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var3")
    fun var3z3test() {
        assertEquals(1.0, var3z3(-2.0))
        assertEquals(0.25, var3z3(0.5))
        assertEquals(4.0, var3z3(3.0))  // checked 02.10
    }

    @Test
    @Tag("var4")
    fun var4z2test() {
        assertFalse(var4z2(-1.0, -1.0))
        assertTrue(var4z2(1.0, -1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var4")
    fun var4z3test() {
        assertEquals(2.0, var4z3(-3.0))
        assertEquals(3.5, var4z3(-0.5))
        assertEquals(3.5, var4z3(0.5))   // checked 02.10
    }

    @Test
    @Tag("var5")
    fun var5z2test() {
        assertFalse(var5z2(-1.0, 1.0))
        assertTrue(var5z2(1.0, -1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var5")
    fun var5z3test() {
        assertEquals(-1.0, var5z3(-3.0))
        assertEquals(1.41, var5z3(-1.41), 0.01)
        assertEquals(2.0, var5z3(1.5))   // checked 02.10
    }

    @Test
    @Tag("var6")
    fun var6z2test() {
        assertFalse(var6z2(-1.0, -1.0))
        assertTrue(var6z2(-1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var6")
    fun var6z3test() {
        assertEquals(1.0, var6z3(-4.0))
        assertEquals(2.121, var6z3(-2.121), 0.001)
        assertEquals(2.121, var6z3(2.121), 0.001)
        assertEquals(-1.0, var6z3(4.0))   // checked 02.10
    }

    @Test
    @Tag("var7")
    fun var7z2test() {
        assertFalse(var7z2(-1.0, 1.0))
        assertTrue(var7z2(1.0, 2.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var7")
    fun var7z3test() {
        assertEquals(2.0, var7z3(-4.0))
        assertEquals(1.500, var7z3(-1.500), 0.001)
        assertEquals(1.500, var7z3(1.500), 0.001)
        assertEquals(2.0, var7z3(3.0))  // checked 02.10
    }

    @Test
    @Tag("var8")
    fun var8z2test() {
        assertFalse(var8z2(-2.0, 2.0))
        assertTrue(var8z2(1.0, -1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var8")
    fun var8z3test() {
        assertEquals(1.0, var8z3(-0.5))
        assertEquals(1.41, var8z3(1.41), 0.01)
        assertEquals(0.0, var8z3(3.0))  // checked 02.10
    }

    @Test
    @Tag("var9")
    fun var9z2test() {
        assertFalse(var9z2(-1.0, 1.0))
        assertTrue(var9z2(1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var9")
    fun var9z3test() {
        assertEquals(-3.0, var9z3(-2.5))
        assertEquals(-1.25, var9z3(-1.5), 0.01)
        assertEquals(-1.25, var9z3(1.5), 0.01)
        assertEquals(-3.0, var9z3(3.0))   // checked 02.10
    }

    @Test
    @Tag("var10")
    fun var10z2test() {
        assertFalse(var10z2(-2.0, 2.0))
        assertTrue(var10z2(-1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var10")
    fun var10z3test() {
        assertEquals(3.0, var10z3(-2.0))
        assertEquals(-0.41, var10z3(1.41), 0.01)
        assertEquals(1.00, var10z3(2.5), 0.01)  // checked 02.10
    }

    @Test
    @Tag("var11")
    fun var11z2test() {
        assertFalse(var11z2(1.0, 2.0))
        assertTrue(var11z2(3.5, -3.14))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var11")
    fun var11z3test() {
        assertEquals(2.0, var11z3(-1.0))
        assertEquals(1.41, var11z3(1.41), 0.01)
        assertEquals(1.0, var11z3(3.0)) // checked 02.10
    }

    @Test
    @Tag("var12")
    fun var12z2test() {
        assertFalse(var12z2(-2.0, 2.0))
        assertTrue(var12z2(-1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var12")
    fun var12z3test() {
        assertEquals(2.0, var12z3(0.0))
        assertEquals(3.0, var12z3(3.0))
        assertEquals(1.0, var12z3(1.5))
        assertEquals(-0.5, var12z3(-2.5), 0.01) // checked 02.10
    }

    @Test
    @Tag("var13")
    fun var13z2test() {
        assertFalse(var13z2(-1.5, -2.0))
        assertTrue(var13z2(-1.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var13")
    fun var13z3test() {
        assertEquals(0.5, var13z3(-0.5), 0.001)
        assertEquals(0.5, var13z3(0.5), 0.001)
        assertEquals(0.0, var13z3(-2.0))
        assertEquals(-2.0, var13z3(4.0)) // checked 02.10
    }

    @Test
    @Tag("var14")
    fun var14z2test() {
        assertFalse(var14z2(-2.0, 2.0))
        assertTrue(var14z2(4.0, 1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var14")
    fun var14z3test() {
        assertEquals(-3.83, var14z3(-1.0), 0.01)
        assertEquals(-3.24, var14z3(2.0), 0.01)
        assertEquals(-0.5, var14z3(3.5))
        assertEquals(-2.0, var14z3(-4.0)) // checked 02.10
    }

    @Test
    @Tag("var15")
    fun var15z2test() {
        assertFalse(var15z2(-1.0, 1.0))
        assertTrue(var15z2(-2.0, 2.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var15")
    fun var15z3test() {
        assertEquals(3.0, var15z3(-1.0), 0.001)
        assertEquals(1.0, var15z3(1.0), 0.001)
        assertEquals(-2.0, var15z3(3.0))
        assertEquals(-3.5, var15z3(3.5), 0.001) // checked 02.10
    }

    @Test
    @Tag("var16")
    fun var16z2test() {
        assertFalse(var16z2(-1.5, 2.0))
        assertTrue(var16z2(-1.0, -1.0))
        // TODO додайте перевірки інших точок
    }

    @Test
    @Tag("var16")
    fun var16z3test() {
        assertEquals(1.0, var16z3(-1.0))
        assertEquals(1.0, var16z3(1.0))
        assertEquals(1.75, var16z3(-0.5))
        assertEquals(-2.0, var16z3(3.0))  // checked 02.10
    }

}