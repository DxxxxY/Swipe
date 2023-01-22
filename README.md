# Swipe
> This is a proof of concept. It is made to open people's eyes about the subject. It is not malware.

In a very distant world, `rat mods` stole your `launcher_accounts.json` or whatever it might've been back then. 

After the Microsoft migration, your access token was no longer stored in such an easy place (at least for me).

People think that the only way to get ratted is with `mods`, because they have access to all of `Minecraft`'s code when `loaded with Forge`. Not really, your access token is more public than you think...

# Compatibility
Feel free to contribute to this table with a PR and a convincing screenshot.

| Client  | Status           |
|---------|------------------|
| Vanilla | `✔️ works`️      |
| Forge   | `✔️ works`️      |
| Feather | `✔️ works`️      |
| Lunar   | `❌ doesn't work` |
| Badlion | `🚧 untested`    |

`Lunar` does not work because its `launcher` never passes the `accessToken` into the vm arguments. It fetches your token with its own authenticator when already in the `client`. So, unless a `launcher` and `client` are both modified/unoriginal, this POC applies.

## Notes
* This POC likely has no counter where the status is `✔️ works`. The reason for that being is because you'd have to change the `vm` on launch with mods. I do not think that it's possible, I may be wrong.
* It is relatively unknown and is much more suspicious because you have to `run` the jar file.

## Disclaimer
This is for educational purposes only. I am not responsible for any damage caused by this tool.

## License
GPLv3 © dxxxxy
