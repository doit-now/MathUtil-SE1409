/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import fu.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author giao-lang
 */
public class MathUtilTest {
    
    //class này muốn chạy thì nó có main() riêng, nhấn Shift-F6 để chạy
    //mỗi hàm trong class này sẽ biến thành main() //nhiều main() trong 
    //1 class luôn, thì hàm cần phải có kí hiệu/chỉ dẫn/annotation @Test
    @Test
    public void testSuccessfulCases() {
        //test các tình huống tham số đưa cho hàm cần test một cách tử tế
        //Assert.assertEquals(30, 40);
        Assert.assertEquals(1, MathUtil.computeFactorial(0));
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
        Assert.assertEquals(2, MathUtil.computeFactorial(2));
        Assert.assertEquals(6, MathUtil.computeFactorial(3));
        Assert.assertEquals(24, MathUtil.computeFactorial(4));
        Assert.assertEquals(120, MathUtil.computeFactorial(5));
        
    }
    
    //main() khác
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //test các tình huống đầu vào cà chớn
        //điều gì xảy ra nếu người dùng mún tính cF(-5)
        //xin lỗi, tính ko đc, quăng ra 1 message chửi người dùng, đưa âm sao tính
        //ném ra 1 ngoại lệ/Exception bảo rằng: tham số/đầu vào vớ vẩn, cà chớn
        //và ngoại lệ là 1 tình huống bất thường ko như dự định
        //và nó ko phải là 1 value để có thể so sánh đc
        //ko thể xài hàm asserEquals()
        //ta phải xài chiêu khác
        MathUtil.computeFactorial(-5);
        
    
    }
    
    //hàm trả về màu đỏ do ko ném về ngoại lệ như kì vọng
    //code mình còn sai trong tình huống số âm, số dương đã màu xanh rồi
    //hàm còn sai về logic, ko sai cú pháp nha, hàm cF()
    //nhưng cho dù viết kiểu cũ sout() bên main() hay asserE() bên JUnit
    //thì code sai logic/màu đỏ vẫn ko ngăn đc việc ta nhấn nút Clean & Build
    //tức là code ko sai cú pháp, vẫn thoải mái ra đc .jar, .war
    //điều này ko hay, ko tốt
    //JUNIT CÓ THỂ KẾT HỢP VỚI NGƯỜI KIẾN ĐỂ CẤM RA FILE .JAR .WAR NẾU CODE CÒN
    //MÀU ĐO, DISABLE NÚT BẤM CLEAN & BUILD NẾU MÀU ĐỎ VẪN CÒN TRONG LÚC CHẠY
    //@TEST
    //HÃY NHỚ 2 CON SỐ: 1005 NETBEANS 8, 1204 NETBEANS 10 TRỞ LÊN
    
    
    
    
    
    
}
