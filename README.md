# AlkalmazasokFejlesztese
Webshop alkalmazás

A feladat leírása:

A program egy elektronikus termékekkel foglalkozó cég online rendszere,
amelyben a vevők megrendelhetik termékeiket.

A webes felületen a vásárlók adhatnak le online rendeléseket a cégnek.

• A főoldalon megjelennek a kategóriák (pl. szórakoztató elektronika, számítástechnika, konyhai gépek).

• A kategóriát kiválasztva listázódik az összes kategóriabeli termék. Egy
oldalon legfeljebb 20 termék jelenik meg, a többit lapozással lehet elérni. A
termékek gyártóval, típusszámmal, rövid leírással, valamint nettó/bruttó
árral rendelkeznek. A listát ár, illetve gyártó szerint rendezhetjük
(növekvő/csökkenő) sorrendbe.

• A vásárló tetszőleges számban helyezheti a kosárba a termékeket (egy
termékből több darabot is rendelhet), majd megadhatja adatait (név, cím,
telefonszám, e-mail cím), és véglegesítheti a rendelést. A véglegesítés előtt a
kosárból lehet törölni is, változtatható a darabszám (amennyiben ez 0-ra
csökken, akkor a termék törlődik), illetve az egész kosár kiüríthető egy
lépésben. A kosarat bármikor meg lehet tekinteni, illetve látható a
nettó/bruttó végösszeg is.

Az alkalmazottak a grafikus felületen keresztül adminisztrálhatják a
rendeléseket, illetve raktárkészleteket.

• Az alkalmazás listázza kategóriánként a termékeket (gyártó, típus, leírás,
nettó/bruttó ár, illetve raktárkészlet), és lehetőség van a raktárkészlet
növelésére az egyes termékeknél.

• Amennyiben a termék hosszabb távon nem hozzáférhető, lehet inaktív
állapotba helyezni. Ez azt jelenti, hogy a webes felületen csak addig jelenik
meg, és addig rendelhető, amíg van belőle raktárkészlet. Továbbá a grafikus
felületen sem lehet a raktárkészletét növelni. Inaktív terméket természetesen
lehet újra aktiválni.

• Az alkalmazás listázza a rendeléseket (dátum, név, cím, telefonszám, e-mail
cím, termékek listája). A teljesítést a munkatárs kijelöléssel tudja kezdeményezni,
amelyre a rendszer megerősítést kér, és automatikusan módosítja a raktárkészletet. 
A rendelések szűrhetőek a megrendelő név, dátum, valamint teljesítettség állapota szerint.

Az adatbázis az alábbi adatokat tárolja:
• kategóriák (név);
• termékek (gyártó, modellszám, leírás, kategória, nettó ár, raktárkészlet, aktíve);
• rendelések (név, cím, telefonszám, e-mail cím, termékek listája, teljesítettség).

A backend dokumentáció a "Backend doksi.docx" fájlban található.

Készítette:
K.András
K.Dániel
