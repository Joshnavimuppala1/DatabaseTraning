package org.example;

public class PortionBrewing {
//        private static final org.slf4j.Logger log =
//                org.slf4j.LoggerFactory.getLogger(PortionBrewing.class);


        public static void brewPotion(int dragonBloodDrops) throws PortionExplosionException
        {
                   // log.info("Starting to brew potion with {} drops of Dragon Blood.", dragonBloodDrops);

                    if (dragonBloodDrops > 5) {
                        throw new PortionExplosionException("Potion exploded! Too many drops (" + dragonBloodDrops + ").");
                    } else {
                        System.out.println("Portion brewed successfully!");
                      //  log.info("Potion brewed successfully with {} drops of Dragon Blood.", dragonBloodDrops);
                    }


        }

    public static void main(String[] args)  {
            try{
                brewPotion(6);
            } catch (PortionExplosionException e) {
                System.out.println( e.getMessage());
            }

    }
}

