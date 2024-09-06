import styles from "./Banner.module.css";
function Banner({imagem}){
    return(
        <section className ={styles.background}>
             <div 
                className={styles.banner}
                style={{backgroundImage : `url('/imagems/${imagem}.png')`}}
            >
            </div >

        </section>
    );

}



export default Banner;