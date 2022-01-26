package com.mobasshir.oops.b;

import com.mobasshir.oops.accessControl.Example1;

public class Access extends Example1 {
    Example1 obj = new Example1();
    int a = obj.publicA;
    // int b = obj.privateA; this cannot be accesed because of private
    // int c = obj.defaultA; this also cannot be accesed because default cannot be
    // accessed outside same package
}
