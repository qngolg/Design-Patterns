package com.ex.pattern.factory.abstrct;

import com.ex.pattern.factory.Mengniu;
import com.ex.pattern.factory.Milk;
import com.ex.pattern.factory.Sanlu;
import com.ex.pattern.factory.Telunsu;
import com.ex.pattern.factory.func.MengniuFactory;
import com.ex.pattern.factory.func.TelunsuFactory;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    public Milk getSanlu() {
        return new Sanlu();
    }
}
