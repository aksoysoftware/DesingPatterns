Tasarım Desenleri (Design Patterns)
1. YAZILIM TASARIM DESENLERİ
1.1 GİRİŞ 🚀
Bu depo, Yazılım Tasarımı Mimarisi dersinde öğrendiğim tasarım kalıpları ve örneklerini içermektedir. Tasarım Desenleri, kodunuzu daha okunabilir, ölçeklenebilir ve bakımı daha kolay hale getirmek için güçlü tasarım prensipleri sunar.

1.2 NEDEN TASARIM DESENLİ KULLANMALIYIZ?
Yazılım tasarım desenleri kullanmak, bir projenin karmaşıklığını yönetmek ve kodunuzun uzun vadeli sağlığını güvence altına almak için önemlidir.

Esneklik ve Değiştirilebilirlik: Tasarım desenleri, kodunuzu değişikliklere daha açık hale getirerek gelecekteki gereksinimlere adapte olmanıza yardımcı olur.

Anlaşılabilirlik: Tasarım desenleri, belirli bir tasarımın amacını ve nasıl çalıştığını anlamayı kolaylaştırır, bu da kodunuzu daha okunabilir kılar.

Tekrar Kullanılabilirlik: Desenler, benzer problemlerle karşılaşıldığında tekrar kullanılabilen modüler çözümler sağlar.

2. CREATIONAL DESENLER 🛠️
2.1 SINGLETON - TEK VARLIK
Singleton deseni, programınızda yalnızca bir örnek oluşturulmasını sağlar. Bu örnek, bir kaynağa tek bir noktadan erişim sağlar.

Singleton

Uygulamanın yaşam süresince bir nesnenin bir kez oluşturulmasını sağlar.

2.2 FACTORY - FABRİKA
Factory deseni, nesne oluşturma sürecini soyutlar ve istemcilerin hangi nesnenin oluşturulacağına karar vermesini kolaylaştırır.

Factory

İstemcilerin spesifik sınıfların oluşturulmasını bilmesine gerek olmadığı durumlarda kullanılır.

2.3 ABSTRACT FACTORY - SOYUT FABRİKA
Abstract Factory deseni, ilgili nesne ailelerini oluşturan soyut bir arayüz sağlar. Bir nesne ailesini değiştirmek istediğinizde kullanışlıdır.

Abstract Factory

Bir nesne ailesini değiştirmeniz ve bununla uyumlu nesneleri oluşturmanız gerektiğinde Abstract Factory kullanırız.

2.4 BUILDER - YAPI TAŞÇISI
Builder deseni, karmaşık nesneleri adım adım oluşturmayı sağlar. Bu sayede farklı temsilciler oluşturabilir ve yapıyı daha iyi kontrol edebilirsiniz.

Builder

Karmaşık nesneleri adım adım oluşturmanız gerektiğinde builder tasarım desenini kullanırız.

3. STRUCTURAL DESENLER 🏗️
3.1 ADAPTER - ADAPTÖR
Adapter deseni, bir nesnenin arabirimini başka birine uyumlu hale getirir, bir tür çevirmen görevi görür.

Adapter

3.2 FACADE - CEPHE
Facade deseni, alt sistemlerin karmaşıklığını gizleyen ve istemciye sadece basitleştirilmiş bir arayüz sunan bir yapı sağlar.

Facade

3.3 BRIDGE - KÖPRÜ
Bridge deseni, soyutlamayı uygulamadan ayırarak, bağlamaları daha esnek ve değiştirilebilir hale getirir.

Bridge

3.4 COMPOSITE - BİLEŞİK
Composite deseni, nesneleri hiyerarşik bir ağaç yapısında birleştirir, böylece tek bir nesne gibi davranabilirler.
![Uploading image.png…]()

