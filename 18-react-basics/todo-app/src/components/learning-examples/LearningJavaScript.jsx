const person = {
    name : "Aditya Raj",
    address : {
        line: "Baker street",
        city: "London",
        country: "UK"
    },
    profiles : ['Twitter', 'Facebook', 'Instagram'],
    printProfile : () => {
        person.profiles.map(
            (profile) => {
                console.log(profile)
            }
        )
    }
}


export default function LearningJavaScript(){
    return (
        <>
            <div>{person.name}</div>
            <div>{person.address.line}</div>
            <div>{person.address.city}</div>
            <div>{person.address.country}</div>
            <div>{person.profiles[0]}</div>
            <div>{person.profiles[1]}</div>
            <div>{person.profiles[2]}</div>
            <div>{person.printProfile()}</div>
        </>
    )
}