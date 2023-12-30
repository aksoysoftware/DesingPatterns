# DesingPatterns(Tasarım Desenleri)

# 1. YAZILIM TASARIM DESENLERİ

## 1.1 GİRİŞ 🚀

 Bu repo, Yazılım Tasarımı Mimarisi dersinde öğrendiğim tasarım kalıpları ve örnekleri. Tasarım Desenleri kodunuzu daha okunabilir, ölçeklenebilir ve bakımı daha kolay hale getirmek için güçlü tasarım prensipleri sunar.

## 1.2 NEDEN TASARIM DESENLİ KULLANMALIYIZ?

Yazılım tasarım desenleri kullanmak, bir projenin karmaşıklığını yönetmek ve kodunuzun uzun vadeli sağlığını güvence altına almak için önemlidir.

- **Esneklik ve Değiştirilebilirlik:** Tasarım desenleri, kodunuzu değişikliklere daha açık hale getirerek gelecekteki gereksinimlere adapte olmanıza yardımcı olur.

- **Anlaşılabilirlik:** Tasarım desenleri, belirli bir tasarımın amacını ve nasıl çalıştığını anlamayı kolaylaştırır, bu da kodunuzu daha okunabilir kılar.

- **Tekrar Kullanılabilirlik:** Desenler, benzer problemlerle karşılaşıldığında tekrar kullanılabilen modüler çözümler sağlar.


## 2. CREATIONAL DESENLİR 🛠️

### 2.1 SINGLETON - TEK VARLIK

Singleton deseni, programınızda yalnızca bir örnek oluşturulmasını sağlar. Bu örnek, bir kaynağa tek bir noktadan erişim sağlar.
![Singleton_pattern_uml](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/c189bc87-2014-4a92-8508-b77515f3703d)


Uygulamanın yaşam süresince bir nesnenin bir kez oluşturulmasını sağlar.

### 2.2 FACTORY - FABRİKA

Factory deseni, nesne oluşturma sürecini soyutlar ve istemcilerin hangi nesnenin oluşturulacağına karar vermesini kolaylaştırır.
https://upload.wikimedia.org/wikipedia/commons/8/8e/Factory_Method_UML_class_diagram<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1000" height="500" xmlns="http://www.w3.org/2000/svg">
  <title>Factory Method Pattern</title>
  <defs>
    <style type="text/css">
      <![CDATA[
      g {
        stroke : #000;
      }
      rect, path {
        fill         : #fff;
        fill-opacity : 0;
      }
      rect {
        stroke-width : 6;
      }
      path, line{
        stroke-width : 2;
      }
      text {
        font-family  : sans-serif;
        stroke-width : 0;
      }
      text.name {
        font-size    : 25px;
        font-weight  : bold;
        text-anchor  : middle;
      }
      text.item {
        font-size    : 25px;
      }
      text.visibility {
        font-size   : 28px;
        font-weight : bold;
        font-family : monospace;
      }
      text.abstract {
        font-size   : 25px;
        font-style  : italic;
      }
      text.stereotype {
        font-size   : 20px;
        text-anchor : middle;
      }
      ]]>
    </style>
  </defs>
  <g transform="translate(40,40)">
    <rect width="400" height="167" />
    <line x1="0" x2="400" y1="60" y2="60" />
    <line x1="0" x2="400" y1="80" y2="80" />
    <text x="200" y="45"  class="name abstract">Creator</text>
    <text x="30"  y="115" class="visibility">#</text>
    <text x="60"  y="115" class="item abstract">factoryMethod() : Product</text>
    <text x="30"  y="150" class="visibility">+</text>
    <text x="60"  y="150" class="item">anOperation()</text>
  </g>
  <g transform="translate(40,330)">
    <rect width="400" height="132" />
    <line x1="0" x2="400" y1="60" y2="60" />
    <line x1="0" x2="400" y1="80" y2="80" />
    <text x="200" y="45"  class="name">ConcreteCreator</text>
    <text x="30"  y="115" class="visibility">+</text>
    <text x="60"  y="115" class="item">factoryMethod() : Product</text>
  </g>
  <g transform="translate(640,40)">
    <rect width="320" height="102" />
    <line x1="0" x2="320" y1="60" y2="60" />
    <line x1="0" x2="320" y1="80" y2="80" />
    <text x="160" y="45" class="name abstract">Product</text>
  </g>
  <g class="class" transform="translate(640,330)">
    <rect width="320" height="102" />
    <line x1="0" x2="320" y1="60" y2="60" />
    <line x1="0" x2="320" y1="80" y2="80" />
    <text x="160" y="45" class="name">ConcreteProduct</text>
  </g>
  <g transform="translate(240,210)">
    <desc>class ConcreteCreator extends Creator.</desc>
    <path d="M 0 2 l -15 30 l 30 0 z" />
    <line x1="0" y1="32" x2="0" y2="120" />
  </g>
  <g transform="translate(800,145)">
    <desc>class ConcreteProduct extends Product.</desc>
    <path d="M 0 2 l -15 30 l 30 0 z" />
    <line x1="0" y1="32" x2="0" y2="185" />
  </g>
  <g transform="translate(440,90)">
    <desc>Creator uses Product.</desc>
    <path d="M 175 -10 l 20 10 l -20 10" />
    <line x1="0" y1="0" x2="195" y2="0" stroke-dasharray="6,3" />
    <text x="100" y="-10" class="stereotype">«use»</text>
  </g>
  <g transform="translate(440,380)">
    <desc>ConcreteCreator creates ConcreteProduct.</desc>
    <path d="M 175 -10 l 20 10 l -20 10" />
    <line x1="0" y1="0" x2="195" y2="0" stroke-dasharray="6,3" />
    <text x="100" y="-10" class="stereotype">«create»</text>
  </g>
</svg>
![Factory_Method_UML_class_diagram](https://github.com/aksoysoftware/DesingPatterns/assets/99371051/512c14a1-ab51-4c11-8ef7-2135cc8d4a5e)
.svg

İstemcilerin spesifik sınıfların oluşturulmasını bilmesine gerek olmadığı durumlarda kullanılır.

### 2.3 ABSTRACT FACTORY - SOYUT FABRİKA

Abstract Factory deseni, ilgili nesne ailelerini oluşturan soyut bir arayüz sağlar. Bir nesne ailesini değiştirmek istediğinizde kullanışlıdır.

https://upload.wikimedia.org/wikipedia/commons/6/67/Abstract_Factory_UML_class_diagram.svg
Bir nesne ailesini değiştirmeniz ve bununla uyumlu nesneleri oluşturmanız gerektiğinde AbstractFactory kullanırız.

### 2.4 BUILDER - YAPI TAŞÇISI

Builder deseni, karmaşık nesneleri adım adım oluşturmayı sağlar. Bu sayede farklı temsilciler oluşturabilir ve yapıyı daha iyi kontrol edebilirsiniz.
https://upload.wikimedia.org/wikipedia/commons/f/f3/Builder_UML_class_diagram.svg
Karmaşık nesneleri adım adım oluşturmanız gerektiğinde builder tasarım desenini kullanırız.

## 3. STRUCTURAL DESENLİR 🏗️

### 3.1 ADAPTER - UYUM ADAPTÖRÜ

Adapter deseni, bir nesnenin arabirimini başka birine uyumlu hale getirir, bir tür çevirmen görevi görür.

### 3.2 FACADE - CEPHANELİK

Facade deseni, alt sistemlerin karmaşıklığını gizleyen ve istemciye sadece basitleştirilmiş bir arayüz sunan bir yapı sağlar.

### 3.3 BRIDGE - KÖPRÜ

Bridge deseni, soyutlamayı uygulamadan ayırarak, bağlamaları daha esnek ve değiştirilebilir hale getirir.

### 3.4 COMPOSITE - BİLEŞİK

Composite deseni, nesneleri hiyerarşik bir ağaç yapısında birleştirir, böylece tek bir nesne gibi davranabilirler.
