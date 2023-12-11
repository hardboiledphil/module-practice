module moduleB {
    requires moduleA;
    exports dev.phil.impl;
    provides dev.phil.MyInterface with dev.phil.impl.MyService;
}