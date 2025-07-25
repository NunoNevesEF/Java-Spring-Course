export default function CounterReset({resetCounterParentFunction}) {

    return (
        <div className="Counter">
            <div>
                <button 
                    className="counterButton green" 
                    onClick={resetCounterParentFunction}                    
                > reset</button>
            </div>
        </div>
    )
}
