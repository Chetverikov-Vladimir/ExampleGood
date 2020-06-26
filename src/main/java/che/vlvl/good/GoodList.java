package che.vlvl.good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class GoodList implements Serializable {

    List<Good> goods;

    public GoodList() {
        goods=new ArrayList<>();
    }

    @XmlElement(name = "good")
    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
